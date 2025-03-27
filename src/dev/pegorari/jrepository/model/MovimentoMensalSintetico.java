package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentoMensalSintetico extends AbstractSankhyaEntity<MovimentoMensalSintetico> {
   public BigDecimal getAno() {
        return this.getVo().asBigDecimal("ANO");
   }

   public void setAno(BigDecimal ano) {
        markAsChanged("ANO", ano);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public Timestamp getDtam() {
        return this.getVo().asTimestamp("DTAM");
   }

   public void setDtam(Timestamp dtam) {
        markAsChanged("DTAM", dtam);
   }

   public String getGrupo() {
        return this.getVo().asString("GRUPO");
   }

   public void setGrupo(String grupo) {
        markAsChanged("GRUPO", grupo);
   }

   public BigDecimal getMes() {
        return this.getVo().asBigDecimal("MES");
   }

   public void setMes(BigDecimal mes) {
        markAsChanged("MES", mes);
   }

   public String getTipMov() {
        return this.getVo().asString("TIPMOV");
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
   }

   public BigDecimal getVlrMov() {
        return this.getVo().asBigDecimal("VLRMOV");
   }

   public void setVlrMov(BigDecimal vlrMov) {
        markAsChanged("VLRMOV", vlrMov);
   }

   @Override
   public String getTableName() {
        return "TGFMMS";
   }

   @Override
   public String getEntityName() {
        return "MovimentoMensalSintetico";
   }

   @Override
   public MovimentoMensalSintetico fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
