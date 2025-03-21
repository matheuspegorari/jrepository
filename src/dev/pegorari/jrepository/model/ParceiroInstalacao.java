package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ParceiroInstalacao extends AbstractSankhyaEntity<ParceiroInstalacao> {
   private BigDecimal codParc;
   private BigDecimal codProj;
   private String contato;
   private Timestamp dtInst;
   private Timestamp dtPrevInst;
   private BigDecimal grupo;
   private BigDecimal numContrato;
   private String obs1;
   private BigDecimal sequencia;
   private String telefone;
   private BigDecimal cgcCpf;
   private String cidadeParc;
   private String complementoParc;
   private String enderecoParc;
   private String estadoParc;
   private String numeroParc;
   private String telefoneParc;
   private String tipoParc;
   private String cepParc;

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public String getContato() {
        return contato;
   }

   public void setContato(String contato) {
        markAsChanged("CONTATO", contato);
        this.contato = contato;
   }

   public Timestamp getDtInst() {
        return dtInst;
   }

   public void setDtInst(Timestamp dtInst) {
        markAsChanged("DTINST", dtInst);
        this.dtInst = dtInst;
   }

   public Timestamp getDtPrevInst() {
        return dtPrevInst;
   }

   public void setDtPrevInst(Timestamp dtPrevInst) {
        markAsChanged("DTPREVINST", dtPrevInst);
        this.dtPrevInst = dtPrevInst;
   }

   public BigDecimal getGrupo() {
        return grupo;
   }

   public void setGrupo(BigDecimal grupo) {
        markAsChanged("GRUPO", grupo);
        this.grupo = grupo;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
        this.numContrato = numContrato;
   }

   public String getObs1() {
        return obs1;
   }

   public void setObs1(String obs1) {
        markAsChanged("OBS1", obs1);
        this.obs1 = obs1;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
        this.telefone = telefone;
   }

   public BigDecimal getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(BigDecimal cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
        this.cgcCpf = cgcCpf;
   }

   public String getCidadeParc() {
        return cidadeParc;
   }

   public void setCidadeParc(String cidadeParc) {
        markAsChanged("CIDADE_PARC", cidadeParc);
        this.cidadeParc = cidadeParc;
   }

   public String getComplementoParc() {
        return complementoParc;
   }

   public void setComplementoParc(String complementoParc) {
        markAsChanged("COMPLEMENTO_PARC", complementoParc);
        this.complementoParc = complementoParc;
   }

   public String getEnderecoParc() {
        return enderecoParc;
   }

   public void setEnderecoParc(String enderecoParc) {
        markAsChanged("ENDERECO_PARC", enderecoParc);
        this.enderecoParc = enderecoParc;
   }

   public String getEstadoParc() {
        return estadoParc;
   }

   public void setEstadoParc(String estadoParc) {
        markAsChanged("ESTADO_PARC", estadoParc);
        this.estadoParc = estadoParc;
   }

   public String getNumeroParc() {
        return numeroParc;
   }

   public void setNumeroParc(String numeroParc) {
        markAsChanged("NUMERO_PARC", numeroParc);
        this.numeroParc = numeroParc;
   }

   public String getTelefoneParc() {
        return telefoneParc;
   }

   public void setTelefoneParc(String telefoneParc) {
        markAsChanged("TELEFONE_PARC", telefoneParc);
        this.telefoneParc = telefoneParc;
   }

   public String getTipoParc() {
        return tipoParc;
   }

   public void setTipoParc(String tipoParc) {
        markAsChanged("TIPO_PARC", tipoParc);
        this.tipoParc = tipoParc;
   }

   public String getCepParc() {
        return cepParc;
   }

   public void setCepParc(String cepParc) {
        markAsChanged("CEP_PARC", cepParc);
        this.cepParc = cepParc;
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
        this.setOriginalVO(vo);
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.contato = vo.asString("CONTATO");
        this.dtInst = vo.asTimestamp("DTINST");
        this.dtPrevInst = vo.asTimestamp("DTPREVINST");
        this.grupo = vo.asBigDecimal("GRUPO");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.obs1 = vo.asString("OBS1");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.telefone = vo.asString("TELEFONE");
        this.cgcCpf = vo.asBigDecimal("CGC_CPF");
        this.cidadeParc = vo.asString("CIDADE_PARC");
        this.complementoParc = vo.asString("COMPLEMENTO_PARC");
        this.enderecoParc = vo.asString("ENDERECO_PARC");
        this.estadoParc = vo.asString("ESTADO_PARC");
        this.numeroParc = vo.asString("NUMERO_PARC");
        this.telefoneParc = vo.asString("TELEFONE_PARC");
        this.tipoParc = vo.asString("TIPO_PARC");
        this.cepParc = vo.asString("CEP_PARC");
        return this;
   }
}
