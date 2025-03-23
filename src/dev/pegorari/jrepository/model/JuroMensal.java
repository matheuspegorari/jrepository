package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class JuroMensal extends AbstractSankhyaEntity<JuroMensal> {
   private String fimMes;
   private BigDecimal indice;
   private BigDecimal nuFin;
   private Timestamp referencia;
   private BigDecimal sinal;
   private BigDecimal vlrJuro;
   private BigDecimal vlrJuroMes;
   private BigDecimal vlrJuroMes2;
   private BigDecimal vlrMulta;
   private BigDecimal vlrMultaMes;
   private BigDecimal codMoeda;
   private BigDecimal codUsu;
   private BigDecimal cotacao;
   private Timestamp dtAlter;

   public String getFimMes() {
        return fimMes;
   }

   public void setFimMes(String fimMes) {
        markAsChanged("FIMMES", fimMes);
        this.fimMes = fimMes;
   }

   public BigDecimal getIndice() {
        return indice;
   }

   public void setIndice(BigDecimal indice) {
        markAsChanged("INDICE", indice);
        this.indice = indice;
   }

   public BigDecimal getNuFin() {
        return nuFin;
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
        this.nuFin = nuFin;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public BigDecimal getSinal() {
        return sinal;
   }

   public void setSinal(BigDecimal sinal) {
        markAsChanged("SINAL", sinal);
        this.sinal = sinal;
   }

   public BigDecimal getVlrJuro() {
        return vlrJuro;
   }

   public void setVlrJuro(BigDecimal vlrJuro) {
        markAsChanged("VLRJURO", vlrJuro);
        this.vlrJuro = vlrJuro;
   }

   public BigDecimal getVlrJuroMes() {
        return vlrJuroMes;
   }

   public void setVlrJuroMes(BigDecimal vlrJuroMes) {
        markAsChanged("VLRJUROMES", vlrJuroMes);
        this.vlrJuroMes = vlrJuroMes;
   }

   public BigDecimal getVlrJuroMes2() {
        return vlrJuroMes2;
   }

   public void setVlrJuroMes2(BigDecimal vlrJuroMes2) {
        markAsChanged("VLRJUROMES2", vlrJuroMes2);
        this.vlrJuroMes2 = vlrJuroMes2;
   }

   public BigDecimal getVlrMulta() {
        return vlrMulta;
   }

   public void setVlrMulta(BigDecimal vlrMulta) {
        markAsChanged("VLRMULTA", vlrMulta);
        this.vlrMulta = vlrMulta;
   }

   public BigDecimal getVlrMultaMes() {
        return vlrMultaMes;
   }

   public void setVlrMultaMes(BigDecimal vlrMultaMes) {
        markAsChanged("VLRMULTAMES", vlrMultaMes);
        this.vlrMultaMes = vlrMultaMes;
   }

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
        this.codMoeda = codMoeda;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCotacao() {
        return cotacao;
   }

   public void setCotacao(BigDecimal cotacao) {
        markAsChanged("COTACAO", cotacao);
        this.cotacao = cotacao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   @Override
   public String getTableName() {
        return "TGFJUM";
   }

   @Override
   public String getEntityName() {
        return "JuroMensal";
   }

   @Override
   public JuroMensal fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.fimMes = vo.asString("FIMMES");
        this.indice = vo.asBigDecimal("INDICE");
        this.nuFin = vo.asBigDecimal("NUFIN");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.sinal = vo.asBigDecimal("SINAL");
        this.vlrJuro = vo.asBigDecimal("VLRJURO");
        this.vlrJuroMes = vo.asBigDecimal("VLRJUROMES");
        this.vlrJuroMes2 = vo.asBigDecimal("VLRJUROMES2");
        this.vlrMulta = vo.asBigDecimal("VLRMULTA");
        this.vlrMultaMes = vo.asBigDecimal("VLRMULTAMES");
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.cotacao = vo.asBigDecimal("COTACAO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        return this;
   }
}
