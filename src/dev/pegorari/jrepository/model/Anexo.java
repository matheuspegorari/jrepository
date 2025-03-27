package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Anexo extends AbstractSankhyaEntity<Anexo> {
   public String getArquivo() {
        return this.getVo().asString("ARQUIVO");
   }

   public void setArquivo(String arquivo) {
        markAsChanged("ARQUIVO", arquivo);
   }

   public BigDecimal getCoData() {
        return this.getVo().asBigDecimal("CODATA");
   }

   public void setCoData(BigDecimal coData) {
        markAsChanged("CODATA", coData);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public byte[] getConteudo() {
        return this.getVo().asBlob("CONTEUDO");
   }

   public void setConteudo(byte[] conteudo) {
        markAsChanged("CONTEUDO", conteudo);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtExpira() {
        return this.getVo().asTimestamp("DTEXPIRA");
   }

   public void setDtExpira(Timestamp dtExpira) {
        markAsChanged("DTEXPIRA", dtExpira);
   }

   public String getEdita() {
        return this.getVo().asString("EDITA");
   }

   public void setEdita(String edita) {
        markAsChanged("EDITA", edita);
   }

   public String getEndArqui() {
        return this.getVo().asString("ENDARQUI");
   }

   public void setEndArqui(String endArqui) {
        markAsChanged("ENDARQUI", endArqui);
   }

   public String getIdentificacaoArquivo() {
        return this.getVo().asString("IDENTIFICACAOARQUIVO");
   }

   public void setIdentificacaoArquivo(String identificacaoArquivo) {
        markAsChanged("IDENTIFICACAOARQUIVO", identificacaoArquivo);
   }

   public String getPublico() {
        return this.getVo().asString("PUBLICO");
   }

   public void setPublico(String publico) {
        markAsChanged("PUBLICO", publico);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getSequenciaPr() {
        return this.getVo().asBigDecimal("SEQUENCIAPR");
   }

   public void setSequenciaPr(BigDecimal sequenciaPr) {
        markAsChanged("SEQUENCIAPR", sequenciaPr);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTipoConteudo() {
        return this.getVo().asString("TIPOCONTEUDO");
   }

   public void setTipoConteudo(String tipoConteudo) {
        markAsChanged("TIPOCONTEUDO", tipoConteudo);
   }

   public Timestamp getDtInclusao() {
        return this.getVo().asTimestamp("DTINCLUSAO");
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        markAsChanged("DTINCLUSAO", dtInclusao);
   }

   public Timestamp getDtVigor() {
        return this.getVo().asTimestamp("DTVIGOR");
   }

   public void setDtVigor(Timestamp dtVigor) {
        markAsChanged("DTVIGOR", dtVigor);
   }

   public String getLink() {
        return this.getVo().asString("LINK");
   }

   public void setLink(String link) {
        markAsChanged("LINK", link);
   }

   @Override
   public String getTableName() {
        return "TSIATA";
   }

   @Override
   public String getEntityName() {
        return "Anexo";
   }

   @Override
   public Anexo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
