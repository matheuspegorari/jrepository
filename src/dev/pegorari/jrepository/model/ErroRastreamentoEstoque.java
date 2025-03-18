package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ErroRastreamentoEstoque extends AbstractSankhyaEntity<ErroRastreamentoEstoque> {
   private BigDecimal chave;
   private BigDecimal codEmp;
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private String msg;
   private String tipoErro;

   public BigDecimal getChave() {
        return chave;
   }

   public void setChave(BigDecimal chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getMsg() {
        return msg;
   }

   public void setMsg(String msg) {
        markAsChanged("MSG", msg);
        this.msg = msg;
   }

   public String getTipoErro() {
        return tipoErro;
   }

   public void setTipoErro(String tipoErro) {
        markAsChanged("TIPOERRO", tipoErro);
        this.tipoErro = tipoErro;
   }

   @Override
   public String getTableName() {
        return "TGFRER";
   }

   @Override
   public String getEntityName() {
        return "ErroRastreamentoEstoque";
   }

   @Override
   public ErroRastreamentoEstoque fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.chave = vo.asBigDecimal("CHAVE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.msg = vo.asString("MSG");
        this.tipoErro = vo.asString("TIPOERRO");
        return this;
   }
}
