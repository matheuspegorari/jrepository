package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDMensagem extends AbstractSankhyaEntity<MSDMensagem> {
   public BigDecimal getIntMin() {
        return this.getVo().asBigDecimal("INTMIN");
   }

   public void setIntMin(BigDecimal intMin) {
        markAsChanged("INTMIN", intMin);
   }

   public char[] getMensagem() {
        return this.getVo().asClob("MENSAGEM");
   }

   public void setMensagem(char[] mensagem) {
        markAsChanged("MENSAGEM", mensagem);
   }

   public Timestamp getProxResol() {
        return this.getVo().asTimestamp("PROXRESOL");
   }

   public void setProxResol(Timestamp proxResol) {
        markAsChanged("PROXRESOL", proxResol);
   }

   public BigDecimal getTentativas() {
        return this.getVo().asBigDecimal("TENTATIVAS");
   }

   public void setTentativas(BigDecimal tentativas) {
        markAsChanged("TENTATIVAS", tentativas);
   }

   public String getTipoConteudo() {
        return this.getVo().asString("TIPOCONTEUDO");
   }

   public void setTipoConteudo(String tipoConteudo) {
        markAsChanged("TIPOCONTEUDO", tipoConteudo);
   }

   public Timestamp getUltResol() {
        return this.getVo().asTimestamp("ULTRESOL");
   }

   public void setUltResol(Timestamp ultResol) {
        markAsChanged("ULTRESOL", ultResol);
   }

   public String getAssunto() {
        return this.getVo().asString("ASSUNTO");
   }

   public void setAssunto(String assunto) {
        markAsChanged("ASSUNTO", assunto);
   }

   public String getAtiva() {
        return this.getVo().asString("ATIVA");
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
   }

   public String getCfgDtResol() {
        return this.getVo().asString("CFGDTRESOL");
   }

   public void setCfgDtResol(String cfgDtResol) {
        markAsChanged("CFGDTRESOL", cfgDtResol);
   }

   public BigDecimal getCodMsg() {
        return this.getVo().asBigDecimal("CODMSG");
   }

   public void setCodMsg(BigDecimal codMsg) {
        markAsChanged("CODMSG", codMsg);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public char[] getCondicao() {
        return this.getVo().asClob("CONDICAO");
   }

   public void setCondicao(char[] condicao) {
        markAsChanged("CONDICAO", condicao);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getIndicacao() {
        return this.getVo().asString("INDICACAO");
   }

   public void setIndicacao(String indicacao) {
        markAsChanged("INDICACAO", indicacao);
   }

   public BigDecimal getCodSmtp() {
        return this.getVo().asBigDecimal("CODSMTP");
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
   }

   @Override
   public String getTableName() {
        return "TMDMSG";
   }

   @Override
   public String getEntityName() {
        return "MSDMensagem";
   }

   @Override
   public MSDMensagem fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
