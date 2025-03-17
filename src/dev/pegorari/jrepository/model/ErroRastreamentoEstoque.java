package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ErroRastreamentoEstoque implements SankhyaEntity<ErroRastreamentoEstoque> {

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
        this.chave = chave;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public String getMsg() {
        return msg;
   }

   public void setMsg(String msg) {
        this.msg = msg;
   }

   public String getTipoErro() {
        return tipoErro;
   }

   public void setTipoErro(String tipoErro) {
        this.tipoErro = tipoErro;
   }

   @Override
   public String getEntityName() {
        return "ErroRastreamentoEstoque";
   }

   @Override
   public ErroRastreamentoEstoque fromVO(DynamicVO vo) {
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
