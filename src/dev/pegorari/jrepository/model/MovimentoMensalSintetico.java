package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentoMensalSintetico extends AbstractSankhyaEntity<MovimentoMensalSintetico> {
   private BigDecimal ano;
   private BigDecimal codEmp;
   private BigDecimal codGrupoProd;
   private BigDecimal codParc;
   private Timestamp dtam;
   private String grupo;
   private BigDecimal mes;
   private String tipMov;
   private BigDecimal vlrMov;

   public BigDecimal getAno() {
        return ano;
   }

   public void setAno(BigDecimal ano) {
        markAsChanged("ANO", ano);
        this.ano = ano;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public Timestamp getDtam() {
        return dtam;
   }

   public void setDtam(Timestamp dtam) {
        markAsChanged("DTAM", dtam);
        this.dtam = dtam;
   }

   public String getGrupo() {
        return grupo;
   }

   public void setGrupo(String grupo) {
        markAsChanged("GRUPO", grupo);
        this.grupo = grupo;
   }

   public BigDecimal getMes() {
        return mes;
   }

   public void setMes(BigDecimal mes) {
        markAsChanged("MES", mes);
        this.mes = mes;
   }

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
        this.tipMov = tipMov;
   }

   public BigDecimal getVlrMov() {
        return vlrMov;
   }

   public void setVlrMov(BigDecimal vlrMov) {
        markAsChanged("VLRMOV", vlrMov);
        this.vlrMov = vlrMov;
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
        this.setOriginalVO(vo);
        this.ano = vo.asBigDecimal("ANO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.dtam = vo.asTimestamp("DTAM");
        this.grupo = vo.asString("GRUPO");
        this.mes = vo.asBigDecimal("MES");
        this.tipMov = vo.asString("TIPMOV");
        this.vlrMov = vo.asBigDecimal("VLRMOV");
        return this;
   }
}
