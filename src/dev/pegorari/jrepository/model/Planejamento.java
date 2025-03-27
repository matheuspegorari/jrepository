package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Planejamento extends AbstractSankhyaEntity<Planejamento> {
   public BigDecimal getCodUsuAvaliador() {
        return this.getVo().asBigDecimal("CODUSUAVALIADOR");
   }

   public void setCodUsuAvaliador(BigDecimal codUsuAvaliador) {
        markAsChanged("CODUSUAVALIADOR", codUsuAvaliador);
   }

   public String getAssuntoEmail() {
        return this.getVo().asString("ASSUNTOEMAIL");
   }

   public void setAssuntoEmail(String assuntoEmail) {
        markAsChanged("ASSUNTOEMAIL", assuntoEmail);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodQuest() {
        return this.getVo().asBigDecimal("CODQUEST");
   }

   public void setCodQuest(BigDecimal codQuest) {
        markAsChanged("CODQUEST", codQuest);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDtFim() {
        return this.getVo().asTimestamp("DTFIM");
   }

   public void setDtFim(Timestamp dtFim) {
        markAsChanged("DTFIM", dtFim);
   }

   public Timestamp getDtInicio() {
        return this.getVo().asTimestamp("DTINICIO");
   }

   public void setDtInicio(Timestamp dtInicio) {
        markAsChanged("DTINICIO", dtInicio);
   }

   public String getFormaDeAplicar() {
        return this.getVo().asString("FORMADEAPLICAR");
   }

   public void setFormaDeAplicar(String formaDeAplicar) {
        markAsChanged("FORMADEAPLICAR", formaDeAplicar);
   }

   public BigDecimal getIntervaloEnvio() {
        return this.getVo().asBigDecimal("INTERVALOENVIO");
   }

   public void setIntervaloEnvio(BigDecimal intervaloEnvio) {
        markAsChanged("INTERVALOENVIO", intervaloEnvio);
   }

   public BigDecimal getMaxEnvio() {
        return this.getVo().asBigDecimal("MAXENVIO");
   }

   public void setMaxEnvio(BigDecimal maxEnvio) {
        markAsChanged("MAXENVIO", maxEnvio);
   }

   public char[] getModeloEmail() {
        return this.getVo().asClob("MODELOEMAIL");
   }

   public void setModeloEmail(char[] modeloEmail) {
        markAsChanged("MODELOEMAIL", modeloEmail);
   }

   public BigDecimal getNuPla() {
        return this.getVo().asBigDecimal("NUPLA");
   }

   public void setNuPla(BigDecimal nuPla) {
        markAsChanged("NUPLA", nuPla);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getCodSmtp() {
        return this.getVo().asBigDecimal("CODSMTP");
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
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
        this.setVo(vo);
        return this;
   }
}
