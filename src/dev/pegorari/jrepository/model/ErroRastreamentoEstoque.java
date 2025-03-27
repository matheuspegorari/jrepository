package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ErroRastreamentoEstoque extends AbstractSankhyaEntity<ErroRastreamentoEstoque> {
   public BigDecimal getChave() {
        return this.getVo().asBigDecimal("CHAVE");
   }

   public void setChave(BigDecimal chave) {
        markAsChanged("CHAVE", chave);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getMsg() {
        return this.getVo().asString("MSG");
   }

   public void setMsg(String msg) {
        markAsChanged("MSG", msg);
   }

   public String getTipoErro() {
        return this.getVo().asString("TIPOERRO");
   }

   public void setTipoErro(String tipoErro) {
        markAsChanged("TIPOERRO", tipoErro);
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
        this.setVo(vo);
        return this;
   }
}
