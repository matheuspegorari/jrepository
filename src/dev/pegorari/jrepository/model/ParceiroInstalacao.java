package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ParceiroInstalacao extends AbstractSankhyaEntity<ParceiroInstalacao> {
   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public String getContato() {
        return this.getVo().asString("CONTATO");
   }

   public void setContato(String contato) {
        markAsChanged("CONTATO", contato);
   }

   public Timestamp getDtInst() {
        return this.getVo().asTimestamp("DTINST");
   }

   public void setDtInst(Timestamp dtInst) {
        markAsChanged("DTINST", dtInst);
   }

   public Timestamp getDtPrevInst() {
        return this.getVo().asTimestamp("DTPREVINST");
   }

   public void setDtPrevInst(Timestamp dtPrevInst) {
        markAsChanged("DTPREVINST", dtPrevInst);
   }

   public BigDecimal getGrupo() {
        return this.getVo().asBigDecimal("GRUPO");
   }

   public void setGrupo(BigDecimal grupo) {
        markAsChanged("GRUPO", grupo);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public String getObs1() {
        return this.getVo().asString("OBS1");
   }

   public void setObs1(String obs1) {
        markAsChanged("OBS1", obs1);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTelefone() {
        return this.getVo().asString("TELEFONE");
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
   }

   public BigDecimal getCgcCpf() {
        return this.getVo().asBigDecimal("CGC_CPF");
   }

   public void setCgcCpf(BigDecimal cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
   }

   public String getCidadeParc() {
        return this.getVo().asString("CIDADE_PARC");
   }

   public void setCidadeParc(String cidadeParc) {
        markAsChanged("CIDADE_PARC", cidadeParc);
   }

   public String getComplementoParc() {
        return this.getVo().asString("COMPLEMENTO_PARC");
   }

   public void setComplementoParc(String complementoParc) {
        markAsChanged("COMPLEMENTO_PARC", complementoParc);
   }

   public String getEnderecoParc() {
        return this.getVo().asString("ENDERECO_PARC");
   }

   public void setEnderecoParc(String enderecoParc) {
        markAsChanged("ENDERECO_PARC", enderecoParc);
   }

   public String getEstadoParc() {
        return this.getVo().asString("ESTADO_PARC");
   }

   public void setEstadoParc(String estadoParc) {
        markAsChanged("ESTADO_PARC", estadoParc);
   }

   public String getNumeroParc() {
        return this.getVo().asString("NUMERO_PARC");
   }

   public void setNumeroParc(String numeroParc) {
        markAsChanged("NUMERO_PARC", numeroParc);
   }

   public String getTelefoneParc() {
        return this.getVo().asString("TELEFONE_PARC");
   }

   public void setTelefoneParc(String telefoneParc) {
        markAsChanged("TELEFONE_PARC", telefoneParc);
   }

   public String getTipoParc() {
        return this.getVo().asString("TIPO_PARC");
   }

   public void setTipoParc(String tipoParc) {
        markAsChanged("TIPO_PARC", tipoParc);
   }

   public String getCepParc() {
        return this.getVo().asString("CEP_PARC");
   }

   public void setCepParc(String cepParc) {
        markAsChanged("CEP_PARC", cepParc);
   }

   @Override
   public String getTableName() {
        return "TCSCPA";
   }

   @Override
   public String getEntityName() {
        return "ParceiroInstalacao";
   }

   @Override
   public ParceiroInstalacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
