package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Curriculo extends AbstractSankhyaEntity<Curriculo> {
   public BigDecimal getNuCurriculoBt() {
        return this.getVo().asBigDecimal("NUCURRICULOBT");
   }

   public void setNuCurriculoBt(BigDecimal nuCurriculoBt) {
        markAsChanged("NUCURRICULOBT", nuCurriculoBt);
   }

   public BigDecimal getNumCps() {
        return this.getVo().asBigDecimal("NUMCPS");
   }

   public void setNumCps(BigDecimal numCps) {
        markAsChanged("NUMCPS", numCps);
   }

   public String getUsoApAuditivo() {
        return this.getVo().asString("USOAPAUDITIVO");
   }

   public void setUsoApAuditivo(String usoApAuditivo) {
        markAsChanged("USOAPAUDITIVO", usoApAuditivo);
   }

   public String getVeicProprio() {
        return this.getVo().asString("VEICPROPRIO");
   }

   public void setVeicProprio(String veicProprio) {
        markAsChanged("VEICPROPRIO", veicProprio);
   }

   public String getNumEnd() {
        return this.getVo().asString("NUMEND");
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
   }

   public String getOrgaOrg() {
        return this.getVo().asString("ORGAORG");
   }

   public void setOrgaOrg(String orgaOrg) {
        markAsChanged("ORGAORG", orgaOrg);
   }

   public String getPais() {
        return this.getVo().asString("PAIS");
   }

   public void setPais(String pais) {
        markAsChanged("PAIS", pais);
   }

   public String getPis() {
        return this.getVo().asString("PIS");
   }

   public void setPis(String pis) {
        markAsChanged("PIS", pis);
   }

   public BigDecimal getPretSalarial() {
        return this.getVo().asBigDecimal("PRETSALARIAL");
   }

   public void setPretSalarial(BigDecimal pretSalarial) {
        markAsChanged("PRETSALARIAL", pretSalarial);
   }

   public BigDecimal getPretSalarialFinal() {
        return this.getVo().asBigDecimal("PRETSALARIALFINAL");
   }

   public void setPretSalarialFinal(BigDecimal pretSalarialFinal) {
        markAsChanged("PRETSALARIALFINAL", pretSalarialFinal);
   }

   public BigDecimal getPretSalarialInicial() {
        return this.getVo().asBigDecimal("PRETSALARIALINICIAL");
   }

   public void setPretSalarialInicial(BigDecimal pretSalarialInicial) {
        markAsChanged("PRETSALARIALINICIAL", pretSalarialInicial);
   }

   public String getRamal() {
        return this.getVo().asString("RAMAL");
   }

   public void setRamal(String ramal) {
        markAsChanged("RAMAL", ramal);
   }

   public String getRne() {
        return this.getVo().asString("RNE");
   }

   public void setRne(String rne) {
        markAsChanged("RNE", rne);
   }

   public String getSerieCps() {
        return this.getVo().asString("SERIECPS");
   }

   public void setSerieCps(String serieCps) {
        markAsChanged("SERIECPS", serieCps);
   }

   public String getSexo() {
        return this.getVo().asString("SEXO");
   }

   public void setSexo(String sexo) {
        markAsChanged("SEXO", sexo);
   }

   public String getSitPais() {
        return this.getVo().asString("SITPAIS");
   }

   public void setSitPais(String sitPais) {
        markAsChanged("SITPAIS", sitPais);
   }

   public String getSkype() {
        return this.getVo().asString("SKYPE");
   }

   public void setSkype(String skype) {
        markAsChanged("SKYPE", skype);
   }

   public BigDecimal getStatus() {
        return this.getVo().asBigDecimal("STATUS");
   }

   public void setStatus(BigDecimal status) {
        markAsChanged("STATUS", status);
   }

   public String getTelCel() {
        return this.getVo().asString("TELCEL");
   }

   public void setTelCel(String telCel) {
        markAsChanged("TELCEL", telCel);
   }

   public String getTelCom() {
        return this.getVo().asString("TELCOM");
   }

   public void setTelCom(String telCom) {
        markAsChanged("TELCOM", telCom);
   }

   public String getTelPref() {
        return this.getVo().asString("TELPREF");
   }

   public void setTelPref(String telPref) {
        markAsChanged("TELPREF", telPref);
   }

   public String getTelRes() {
        return this.getVo().asString("TELRES");
   }

   public void setTelRes(String telRes) {
        markAsChanged("TELRES", telRes);
   }

   public BigDecimal getTipDeficiencia() {
        return this.getVo().asBigDecimal("TIPDEFICIENCIA");
   }

   public void setTipDeficiencia(BigDecimal tipDeficiencia) {
        markAsChanged("TIPDEFICIENCIA", tipDeficiencia);
   }

   public String getTipoEnd() {
        return this.getVo().asString("TIPOEND");
   }

   public void setTipoEnd(String tipoEnd) {
        markAsChanged("TIPOEND", tipoEnd);
   }

   public String getTwitter() {
        return this.getVo().asString("TWITTER");
   }

   public void setTwitter(String twitter) {
        markAsChanged("TWITTER", twitter);
   }

   public String getUf() {
        return this.getVo().asString("UF");
   }

   public void setUf(String uf) {
        markAsChanged("UF", uf);
   }

   public BigDecimal getUfCps() {
        return this.getVo().asBigDecimal("UFCPS");
   }

   public void setUfCps(BigDecimal ufCps) {
        markAsChanged("UFCPS", ufCps);
   }

   public BigDecimal getAnoChegPais() {
        return this.getVo().asBigDecimal("ANOCHEGPAIS");
   }

   public void setAnoChegPais(BigDecimal anoChegPais) {
        markAsChanged("ANOCHEGPAIS", anoChegPais);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getBairro() {
        return this.getVo().asString("BAIRRO");
   }

   public void setBairro(String bairro) {
        markAsChanged("BAIRRO", bairro);
   }

   public String getCategoriaCnh() {
        return this.getVo().asString("CATEGORIACNH");
   }

   public void setCategoriaCnh(String categoriaCnh) {
        markAsChanged("CATEGORIACNH", categoriaCnh);
   }

   public String getCep() {
        return this.getVo().asString("CEP");
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
   }

   public String getCidade() {
        return this.getVo().asString("CIDADE");
   }

   public void setCidade(String cidade) {
        markAsChanged("CIDADE", cidade);
   }

   public String getCnh() {
        return this.getVo().asString("CNH");
   }

   public void setCnh(String cnh) {
        markAsChanged("CNH", cnh);
   }

   public BigDecimal getCodTipParc() {
        return this.getVo().asBigDecimal("CODTIPPARC");
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
   }

   public String getInApropriado() {
        return this.getVo().asString("INAPROPRIADO");
   }

   public void setInApropriado(String inApropriado) {
        markAsChanged("INAPROPRIADO", inApropriado);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getComplEnd() {
        return this.getVo().asString("COMPLEND");
   }

   public void setComplEnd(String complEnd) {
        markAsChanged("COMPLEND", complEnd);
   }

   public String getConsideracoes() {
        return this.getVo().asString("CONSIDERACOES");
   }

   public void setConsideracoes(String consideracoes) {
        markAsChanged("CONSIDERACOES", consideracoes);
   }

   public String getCpf() {
        return this.getVo().asString("CPF");
   }

   public void setCpf(String cpf) {
        markAsChanged("CPF", cpf);
   }

   public String getDefAuditivo() {
        return this.getVo().asString("DEFAUDITIVO");
   }

   public void setDefAuditivo(String defAuditivo) {
        markAsChanged("DEFAUDITIVO", defAuditivo);
   }

   public String getDefFala() {
        return this.getVo().asString("DEFFALA");
   }

   public void setDefFala(String defFala) {
        markAsChanged("DEFFALA", defFala);
   }

   public String getDeficiente() {
        return this.getVo().asString("DEFICIENTE");
   }

   public void setDeficiente(String deficiente) {
        markAsChanged("DEFICIENTE", deficiente);
   }

   public String getDefIndependente() {
        return this.getVo().asString("DEFINDEPENDENTE");
   }

   public void setDefIndependente(String defIndependente) {
        markAsChanged("DEFINDEPENDENTE", defIndependente);
   }

   public String getDefIntelectual() {
        return this.getVo().asString("DEFINTELECTUAL");
   }

   public void setDefIntelectual(String defIntelectual) {
        markAsChanged("DEFINTELECTUAL", defIntelectual);
   }

   public String getDefOutras() {
        return this.getVo().asString("DEFOUTRAS");
   }

   public void setDefOutras(String defOutras) {
        markAsChanged("DEFOUTRAS", defOutras);
   }

   public String getDefOutrosRecursos() {
        return this.getVo().asString("DEFOUTROSRECURSOS");
   }

   public void setDefOutrosRecursos(String defOutrosRecursos) {
        markAsChanged("DEFOUTROSRECURSOS", defOutrosRecursos);
   }

   public BigDecimal getDefRecursos() {
        return this.getVo().asBigDecimal("DEFRECURSOS");
   }

   public void setDefRecursos(BigDecimal defRecursos) {
        markAsChanged("DEFRECURSOS", defRecursos);
   }

   public BigDecimal getDefRecursosImpres() {
        return this.getVo().asBigDecimal("DEFRECURSOSIMPRES");
   }

   public void setDefRecursosImpres(BigDecimal defRecursosImpres) {
        markAsChanged("DEFRECURSOSIMPRES", defRecursosImpres);
   }

   public String getDefVisual() {
        return this.getVo().asString("DEFVISUAL");
   }

   public void setDefVisual(String defVisual) {
        markAsChanged("DEFVISUAL", defVisual);
   }

   public String getDescrDeficiencia() {
        return this.getVo().asString("DESCRDEFICIENCIA");
   }

   public void setDescrDeficiencia(String descrDeficiencia) {
        markAsChanged("DESCRDEFICIENCIA", descrDeficiencia);
   }

   public String getDispMudanca() {
        return this.getVo().asString("DISPMUDANCA");
   }

   public void setDispMudanca(String dispMudanca) {
        markAsChanged("DISPMUDANCA", dispMudanca);
   }

   public String getDispViagem() {
        return this.getVo().asString("DISPVIAGEM");
   }

   public void setDispViagem(String dispViagem) {
        markAsChanged("DISPVIAGEM", dispViagem);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtInclusao() {
        return this.getVo().asTimestamp("DTINCLUSAO");
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        markAsChanged("DTINCLUSAO", dtInclusao);
   }

   public Timestamp getDtNasc() {
        return this.getVo().asTimestamp("DTNASC");
   }

   public void setDtNasc(Timestamp dtNasc) {
        markAsChanged("DTNASC", dtNasc);
   }

   public Timestamp getDtValCnh() {
        return this.getVo().asTimestamp("DTVALCNH");
   }

   public void setDtValCnh(Timestamp dtValCnh) {
        markAsChanged("DTVALCNH", dtValCnh);
   }

   public Timestamp getDtValPais() {
        return this.getVo().asTimestamp("DTVALPAIS");
   }

   public void setDtValPais(Timestamp dtValPais) {
        markAsChanged("DTVALPAIS", dtValPais);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public BigDecimal getEstadoCivil() {
        return this.getVo().asBigDecimal("ESTADOCIVIL");
   }

   public void setEstadoCivil(BigDecimal estadoCivil) {
        markAsChanged("ESTADOCIVIL", estadoCivil);
   }

   public String getEstrangeiro() {
        return this.getVo().asString("ESTRANGEIRO");
   }

   public void setEstrangeiro(String estrangeiro) {
        markAsChanged("ESTRANGEIRO", estrangeiro);
   }

   public String getFacebook() {
        return this.getVo().asString("FACEBOOK");
   }

   public void setFacebook(String facebook) {
        markAsChanged("FACEBOOK", facebook);
   }

   public byte[] getFoto() {
        return this.getVo().asBlob("FOTO");
   }

   public void setFoto(byte[] foto) {
        markAsChanged("FOTO", foto);
   }

   public String getGooglePlus() {
        return this.getVo().asString("GOOGLEPLUS");
   }

   public void setGooglePlus(String googlePlus) {
        markAsChanged("GOOGLEPLUS", googlePlus);
   }

   public BigDecimal getGrauInstr() {
        return this.getVo().asBigDecimal("GRAUINSTR");
   }

   public void setGrauInstr(BigDecimal grauInstr) {
        markAsChanged("GRAUINSTR", grauInstr);
   }

   public String getIdentidade() {
        return this.getVo().asString("IDENTIDADE");
   }

   public void setIdentidade(String identidade) {
        markAsChanged("IDENTIDADE", identidade);
   }

   public String getInclusaoMge() {
        return this.getVo().asString("INCLUSAOMGE");
   }

   public void setInclusaoMge(String inclusaoMge) {
        markAsChanged("INCLUSAOMGE", inclusaoMge);
   }

   public String getIndicacao() {
        return this.getVo().asString("INDICACAO");
   }

   public void setIndicacao(String indicacao) {
        markAsChanged("INDICACAO", indicacao);
   }

   public String getLinkedin() {
        return this.getVo().asString("LINKEDIN");
   }

   public void setLinkedin(String linkedin) {
        markAsChanged("LINKEDIN", linkedin);
   }

   public String getNaturalidade() {
        return this.getVo().asString("NATURALIDADE");
   }

   public void setNaturalidade(String naturalidade) {
        markAsChanged("NATURALIDADE", naturalidade);
   }

   public String getNomeCandidato() {
        return this.getVo().asString("NOMECANDIDATO");
   }

   public void setNomeCandidato(String nomeCandidato) {
        markAsChanged("NOMECANDIDATO", nomeCandidato);
   }

   public String getNomeEnd() {
        return this.getVo().asString("NOMEEND");
   }

   public void setNomeEnd(String nomeEnd) {
        markAsChanged("NOMEEND", nomeEnd);
   }

   public BigDecimal getNuCurriculo() {
        return this.getVo().asBigDecimal("NUCURRICULO");
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        markAsChanged("NUCURRICULO", nuCurriculo);
   }

   public BigDecimal getTipoCurriculo() {
        return this.getVo().asBigDecimal("TIPOCURRICULO");
   }

   public void setTipoCurriculo(BigDecimal tipoCurriculo) {
        markAsChanged("TIPOCURRICULO", tipoCurriculo);
   }

   public String getDeficienteF() {
        return this.getVo().asString("DEFICIENTEF");
   }

   public void setDeficienteF(String deficienteF) {
        markAsChanged("DEFICIENTEF", deficienteF);
   }

   @Override
   public String getTableName() {
        return "TFCBCO";
   }

   @Override
   public String getEntityName() {
        return "Curriculo";
   }

   @Override
   public Curriculo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
