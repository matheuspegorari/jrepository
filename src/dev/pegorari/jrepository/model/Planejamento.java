package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Planejamento extends AbstractSankhyaEntity<Planejamento> {
   private BigDecimal codUsuAvaliador;
   private String assuntoEmail;
   private BigDecimal codParc;
   private BigDecimal codQuest;
   private BigDecimal codUsu;
   private String descricao;
   private Timestamp dhAlter;
   private Timestamp dtFim;
   private Timestamp dtInicio;
   private String formaDeAplicar;
   private BigDecimal intervaloEnvio;
   private BigDecimal maxEnvio;
   private char[] modeloEmail;
   private BigDecimal nuPla;
   private String status;
   private BigDecimal codSmtp;

   public BigDecimal getCodUsuAvaliador() {
        return codUsuAvaliador;
   }

   public void setCodUsuAvaliador(BigDecimal codUsuAvaliador) {
        markAsChanged("CODUSUAVALIADOR", codUsuAvaliador);
        this.codUsuAvaliador = codUsuAvaliador;
   }

   public String getAssuntoEmail() {
        return assuntoEmail;
   }

   public void setAssuntoEmail(String assuntoEmail) {
        markAsChanged("ASSUNTOEMAIL", assuntoEmail);
        this.assuntoEmail = assuntoEmail;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodQuest() {
        return codQuest;
   }

   public void setCodQuest(BigDecimal codQuest) {
        markAsChanged("CODQUEST", codQuest);
        this.codQuest = codQuest;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDtFim() {
        return dtFim;
   }

   public void setDtFim(Timestamp dtFim) {
        markAsChanged("DTFIM", dtFim);
        this.dtFim = dtFim;
   }

   public Timestamp getDtInicio() {
        return dtInicio;
   }

   public void setDtInicio(Timestamp dtInicio) {
        markAsChanged("DTINICIO", dtInicio);
        this.dtInicio = dtInicio;
   }

   public String getFormaDeAplicar() {
        return formaDeAplicar;
   }

   public void setFormaDeAplicar(String formaDeAplicar) {
        markAsChanged("FORMADEAPLICAR", formaDeAplicar);
        this.formaDeAplicar = formaDeAplicar;
   }

   public BigDecimal getIntervaloEnvio() {
        return intervaloEnvio;
   }

   public void setIntervaloEnvio(BigDecimal intervaloEnvio) {
        markAsChanged("INTERVALOENVIO", intervaloEnvio);
        this.intervaloEnvio = intervaloEnvio;
   }

   public BigDecimal getMaxEnvio() {
        return maxEnvio;
   }

   public void setMaxEnvio(BigDecimal maxEnvio) {
        markAsChanged("MAXENVIO", maxEnvio);
        this.maxEnvio = maxEnvio;
   }

   public char[] getModeloEmail() {
        return modeloEmail;
   }

   public void setModeloEmail(char[] modeloEmail) {
        markAsChanged("MODELOEMAIL", modeloEmail);
        this.modeloEmail = modeloEmail;
   }

   public BigDecimal getNuPla() {
        return nuPla;
   }

   public void setNuPla(BigDecimal nuPla) {
        markAsChanged("NUPLA", nuPla);
        this.nuPla = nuPla;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getCodSmtp() {
        return codSmtp;
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
        this.codSmtp = codSmtp;
   }

   @Override
   public String getTableName() {
        return "TPQPLA";
   }

   @Override
   public String getEntityName() {
        return "Planejamento";
   }

   @Override
   public Planejamento fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codUsuAvaliador = vo.asBigDecimal("CODUSUAVALIADOR");
        this.assuntoEmail = vo.asString("ASSUNTOEMAIL");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codQuest = vo.asBigDecimal("CODQUEST");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descricao = vo.asString("DESCRICAO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dtFim = vo.asTimestamp("DTFIM");
        this.dtInicio = vo.asTimestamp("DTINICIO");
        this.formaDeAplicar = vo.asString("FORMADEAPLICAR");
        this.intervaloEnvio = vo.asBigDecimal("INTERVALOENVIO");
        this.maxEnvio = vo.asBigDecimal("MAXENVIO");
        this.modeloEmail = vo.asClob("MODELOEMAIL");
        this.nuPla = vo.asBigDecimal("NUPLA");
        this.status = vo.asString("STATUS");
        this.codSmtp = vo.asBigDecimal("CODSMTP");
        return this;
   }
}
